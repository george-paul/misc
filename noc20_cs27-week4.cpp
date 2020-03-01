#include <iostream>
#include <vector>
#include <climits>
#include <utility>
#include <cmath>
using namespace std;

vector<vector<pair<int, int>>> G{};
vector<pair<int,int>> Deled{};
int N;

int Dijkstras(int start, int finish)
{
	int Visited[3000], Distance[3000];
	for(int i=1; i<=3000; i++)
	{
		Visited[i]=0;
		Distance[i]=INT_MAX;
	}
	Distance[start]=0;
	for(int i=1; i<=N+1; i++)			//there are max N+1 nodes for N edges
	{
		int minDist=INT_MAX, minPos;
		for(int i=1; i<=3000; i++)			//i<=3000
		{
			if((!G[i].empty()) && (!(Visited[i])) && (Distance[i]<minDist))
			{
				minDist=Distance[i];
				minPos=i;
			}
		}
		Visited[minPos]=1;
		for(auto a:G[minPos])
		{
			if (!((minPos==start&&a.first==finish)||(minPos==finish&&a.first==start)))			//ignore start-finish edge
				if(Distance[a.first]>Distance[minPos]+a.second)
				{
					Distance[a.first]=Distance[minPos]+a.second;
				}
		}
	}

	int res=Distance[finish];

	for(auto a:G[finish])
	{
		if(a.first==start)
		{
			res+=a.second;
			break;
		}
	}

	return res;
}

int IsDeled(int a, int b)
{
	for(auto p:Deled)
	{
		if(p.first==a&&p.second==b)
		{
			return 1;
		}
	}
	return 0;
}

int ShortestCircPath()
{
	int temp, minD=INT_MAX;
	for(int i=1; i<=3000; i++)
	{
		if(!G[i].empty()&&G[i].size()>1)
		{
			for(auto a:G[i])
			{
				if (G[a.first].size()>1&&(!IsDeled(i,a.first)))
				{
					Deled.push_back({i,a.first});
					Deled.push_back({a.first,i});
					temp=Dijkstras(i,a.first);
					if(temp<minD) minD=temp;
				}
			}
		}
	}
	return minD;
}

int main()
{
	freopen("C:/SSDFiles/GitStuff/misc/input.txt","r",stdin);		//txt file stdin

	int S,T,D;
	cin>>N;
	for(int i=0; i<=3000; i++)
	{
		G.push_back({});
	}
	for(int i=1; i<=N; i++)
	{
		cin>>S>>T>>D;
		G[S].push_back({T,D});
		G[T].push_back({S,D});
	}

	cout<<ShortestCircPath()<<'\n';
	return 0;
}