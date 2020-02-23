#include <iostream>
#include <cstdio>
#include <vector>
#include <algorithm>
#include <queue>

#define DE(x) cout<<'>'<<#x<<':'<<x<<endl;

using namespace std;

class City
{
public:
	int no=0;
	int mus=0;
	int visited=0;
	vector<int> adj{};
};

int N, M, K;
vector<City> cities;
vector<City> Tcities;

// void sortCities(vector<City> &Tcities, int lower, int upper)
// {
// 	if(upper<=lower)
// 		return;
// 	City temp;
// 	int pivot=Tcities[upper].mus;
// 	int lesser=lower, i;
// 	for(i=lower; i<upper; i++)
// 	{
// 		if(Tcities[i].mus<pivot)
// 		{
// 			temp=Tcities[i];
// 			Tcities[i]=Tcities[lesser];
// 			Tcities[lesser]=temp;
// 			lesser++;
// 		}
// 	}
// 	temp=Tcities[lesser];
// 	Tcities[lesser]=Tcities[upper];
// 	Tcities[upper]=temp;
// 	sortCities(Tcities,lower,lesser-1);
// 	sortCities(Tcities,lesser+1, upper);
// 	return;
// }

int MAXmus()
{
	int maxpos=0;
	for(int i=0; i<N; i++)
	{
		if(cities[i].mus>cities[maxpos].mus && !(cities[i].visited))
		{
			maxpos=i;
		}
	}
	return cities[maxpos].no;
}

int MINmus()
{
	int maxpos=0;
	for(int i=0; i<N; i++)
	{
		if(cities[i].mus<cities[maxpos].mus && !(cities[i].visited))
		{
			maxpos=i;
		}
	}
	return cities[maxpos].no;
}

int citiesUnvisited()
{
	for(int i=0; i<N; i++)
	{
		if(cities[i].visited==0)
		{
			return 1;
		}
	}
	return 0;
}

int Month(int pos)
{
	queue<int> q;
	int i, sum=cities[pos].mus;
	q.push(pos);
	cities[pos].visited=1;
	while(!q.empty())
	{
		i=q.front();
		q.pop();
		for(auto j=cities[i].adj.begin(); j!=cities[i].adj.end(); j++)
		{
			int a=*j;
			if(!cities[a].visited)
			{
				cities[a].visited=1;
				sum+=cities[a].mus;
				q.push(a);
			}
		}
	}
	return sum;
}

int Fun()
{
	int i, sumOfMuseums=0;
	Tcities = cities;
	for(i=0; i<K&&citiesUnvisited(); i++)
	{
		if(i%2==0)		//Lavanya
		{
			sumOfMuseums+=Month(MAXmus());
		}
		else			//Nikhil
		{
			sumOfMuseums+=Month(MINmus());
		}
	}
	if(i<K)
		return -1;
	else
		return sumOfMuseums;
}

int main()
{
	freopen("C:/SSDFiles/GitStuff/misc/input.txt", "r", stdin);				//text input
	int i, u, v;
	City c;

	cin>>N>>M>>K;
	for (int i=0; i<N; i++)
	{
		cities.push_back(c);
	}
	for(i=0; i<M; i++)
	{
		cin>>u>>v;
		u--;v--;
		cities[u].adj.push_back(v);
		cities[v].adj.push_back(u);
	}
	for(i=0; i<N; i++)
	{
		cin>>u;
		cities[i].mus=u;
		cities[i].no=i;
	}

	cout<<Fun()<<'\n';

	return 0;
}