#include<stdio.h>
#include<math.h>
#include<limits.h>

void main()
{
	freopen("C:/SSDFiles/GitStuff/misc/input.txt","r",stdin);		//txt file stdin

	int i, j, sum=0;
	float target;
	int M, K, B[500];
	scanf("%d %d", &M, &K);
	for(i=0; i<M; i++)
	{
		scanf("%d", &B[i]);
		sum+=B[i];
	}
						//SORT B
	target=sum/K;
	i=0;
	int temp;
	for(j=0; j<K; j++)
	{
		sum=0;
		temp=fabs(target-B[i]);
		for(; i<M; i++)
		{
			// if(i==0)
			// {
			// 	//printf("%d ",B[i]);
			// 	continue;
			// }
			sum+=B[i];
			if(M-i<K-j)
				break;
			if(fabs(target-sum)>temp)
			{
				temp=fabs(target-B[i]);
				break;
			}
			else
			{
				printf("%d ",B[i]);
				temp=fabs(target-sum);
			}
		}
		if(j!=(K-1))
			printf("/ ");
	}
}