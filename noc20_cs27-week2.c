/*input
8 3 1
5 6 
2 4
2 3
*/

/*
5 6 0
2 2
3 5
1 3
4 4
5 1
6 8

5 2 0
2 2
3 5

5 2 1
2 2
2 5

5 2 1
2 3
2 5
*/

#include <stdio.h>

void display(long long int set[][100001], long int lower, long int upper)
{
	long int i;
	printf("\n");
	for(i=lower; i<=upper; i++)
	{
		printf("%lli %lli \n", set[0][i], set[1][i]);
	}
}

void quickSortSets(long long int set[][100001], long int lower, long int upper)
{
	if(lower>=upper)
	{
		return;
	}
	long int lesser=lower+1, i;
	long int pivot=set[0][lower], temp;
	for(i=lesser; i<=upper; i++)
	{
		if(set[0][i]<pivot)
		{
			temp=set[0][lesser];
			set[0][lesser]=set[0][i];
			set[0][i]=temp;
			temp=set[1][lesser];
			set[1][lesser]=set[1][i];
			set[1][i]=temp;
			lesser++;
		}
	}
	temp=set[0][lower];
	set[0][lower]=set[0][lesser-1];
	set[0][lesser-1]=temp;
	temp=set[1][lower];
	set[1][lower]=set[1][lesser-1];
	set[1][lesser-1]=temp;
	quickSortSets(set, lower, lesser-1);
	quickSortSets(set, lesser, upper);
	return;
}

void quickSortSetsWrtEnd(long long int set[][100001], long int lower, long int upper)
{
	if(lower>=upper)
	{
		return;
	}
	long int lesser=lower+1, i;
	long int pivot=set[1][lower], temp;
	for(i=lesser; i<=upper; i++)
	{
		if(set[1][i]<pivot)
		{
			temp=set[0][lesser];
			set[0][lesser]=set[0][i];
			set[0][i]=temp;
			temp=set[1][lesser];
			set[1][lesser]=set[1][i];
			set[1][i]=temp;
			lesser++;
		}
	}
	temp=set[0][lower];
	set[0][lower]=set[0][lesser-1];
	set[0][lesser-1]=temp;
	temp=set[1][lower];
	set[1][lower]=set[1][lesser-1];
	set[1][lesser-1]=temp;
	quickSortSets(set, lower, lesser-1);
	quickSortSets(set, lesser, upper);
	return;
}

void main()
{
	int K;
	long int N, i;
	long long int C;
	long long int set[2][100001];
	scanf("%lli ", &C);
	scanf("%li ", &N);
	scanf("%d ", &K);
	for(i=0; i<N; i++)
	{
		scanf("%lli %lli ", &set[0][i], &set[1][i]);
	}
	quickSortSets(set,0,N-1);
	quickSortSetsWrtEnd(set, 0, N-1);
	display(set,0,N-1);
	if(K==0)
	{
		for(i=0; i<N-1; i++)
		{
			if(set[0][i+1]<set[1][i])
			{
				printf("Bad\n");
				return;
			}
		}
		printf("Good\n");
	}
	else
	{
		long int flag=-1;
		long long int maxdiff=set[0][0]-1;
		for(i=0; i<N-1; i++)
		{
			if(set[0][i+1]<=set[1][i])
			{
				if(flag>=0)
				{
					printf("Bad\n");
					return;
				}
				else
					flag=i;
			}
			if(set[0][i+1]-set[1][i]>maxdiff)
				maxdiff=set[0][i+1]-set[1][i]-1;
		}
		if(C-set[1][N-1]>maxdiff)
			maxdiff=C-set[1][N-1];
		//printf("%d\n", maxdiff);
		if(set[1][flag]-set[0][flag]+1<=maxdiff||set[1][flag+1]-set[0][flag+1]+1<=maxdiff)
		{
			printf("Good\n");
			return;
		}
		else
		{
			printf("Bad\n");
			return;
		}
	}
}