#include <stdio.h>
#include <limits.h>

void QuickSortDragons(int dr[][2], int lower, int upper)
{
	if(lower>=upper)
		{return;}
	int pivot=dr[lower][0];
	int i, point, temp;
	for(i=lower+1, point=lower+1;i<=upper;i++)
	{
		if(dr[i][0]>pivot)
		{
			temp=dr[i][0];
			dr[i][0]=dr[point][0];
			dr[point][0]=temp;
			temp=dr[i][1];
			dr[i][1]=dr[point][1];
			dr[point][1]=temp;
			point++;
		}
	}
	temp=dr[lower][0];
	dr[lower][0]=dr[point-1][0];
	dr[point-1][0]=temp;
	temp=dr[lower][1];
	dr[lower][1]=dr[point-1][1];
	dr[point-1][1]=temp;
	QuickSortDragons(dr, lower, point-1);
	QuickSortDragons(dr, point, upper);
	return;
}

void main()
{
	freopen("C:/SSDFiles/GitStuff/misc/input.txt", "r", stdin);			//text input
	int i;
	int Dragons[300][2];
	int K, D, R, C;
	scanf("%d %d %d %d ", &R, &C, &K, &D);
	for(i=0;i<D;i++)
	{
		scanf("%d %d ", &Dragons[i][0], &Dragons[i][1]);
	}
	QuickSortDragons(Dragons, 0, D-1);
	int mindist[300][300];
	for(i=0;i<D;i++)
	{
		printf("%d, %d\n", Dragons[i][0], Dragons[i][1]);
	}
	return;
}