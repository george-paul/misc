#include <iostream>
#include <cstdio>
#include <vector>
#include <algorithm>
#include <queue>
#include <climits>

#define DE(x) cout<<'>'<<#x<<':'<<x<<endl;

using namespace std;

class City
{
public:
	long long int no=0;
	long long int mus=0;
	long long int visited=0;
	vector<long long int> adj{};
};

long long int N, M, K;
vector<City> cities;
//vector<City> Tcities;

// void sortCities(vector<City> &Tcities, long long int lower, long long int upper)
// {
// 	if(upper<=lower)
// 		return;
// 	City temp;
// 	long long int pivot=Tcities[upper].mus;
// 	long long int lesser=lower, i;
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

long long int MAXmus()
{
	long long int val=-1;
	long long int pos=0;
	for(long long int i=0; i<N; i++)
	{
		if(cities[i].mus>cities[pos].mus && !(cities[i].visited))
		{
			val=cities[i].mus;
			pos=i;
		}
	}
	return cities[pos].no;
}

long long int MINmus()
{
	long long int val=LLONG_MAX;
	long long int pos=0;
	for(long long int i=0; i<N; i++)
	{
		if(cities[i].mus<val && !(cities[i].visited))
		{
			val=cities[i].mus;
			pos=i;
		}
	}
	return cities[pos].no;
}

long long int citiesUnvisited()
{
	for(long long int i=0; i<N; i++)
	{
		if(cities[i].visited==0)
		{
			return 1;
		}
	}
	return 0;
}

long long int Month(long long int pos)
{
	queue<long long int> q;
	long long int i, sum=cities[pos].mus;
	q.push(pos);
	cities[pos].visited=1;
	while(!q.empty())
	{
		i=q.front();
		q.pop();
		for(auto j=cities[i].adj.begin(); j!=cities[i].adj.end(); j++)
		{
			long long int a=*j;
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

long long int Fun()
{
	long long int i, sumOfMuseums=0;
	//Tcities = cities;
	for(i=0; i<K&&citiesUnvisited(); i++)
	{
		if(i%2==0)		//Lavanya
		{
			sumOfMuseums+=Month(MAXmus());
			//DE(sumOfMuseums);
		}
		else			//Nikhil
		{
			sumOfMuseums+=Month(MINmus());
			//DE(sumOfMuseums);
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
	long long int i, u, v;
	City c;

	cin>>N>>M>>K;
	for (long long int i=0; i<N; i++)
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