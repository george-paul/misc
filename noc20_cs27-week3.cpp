#include <iostream>
#include <cstdio>
#include <vector>
#include <algorithm>

#define DE(x) cout<<'>'<<#x<<':'<<x<<endl;

using namespace std;

class City
{
public:
	int mus=0;
	vector<int> adj{};
};

std::vector<char> v;
if (FILE *fp = fopen("filename", "r"))
{
	char buf[1024];
	while (size_t len = fread(buf, 1, sizeof(buf), fp))
		v.insert(v.end(), buf, buf + len);
	fclose(fp);
}int N, M, K;
vector<City> cities;

void sortCities(int lower, int upper)
{
	if(upper<=lower)
		return;
	int pivot=cities[upper].mus;
	int lesser=lower;
	for(int i=1; i<upper; i++)
	{
		if(cities[i].mus<pivot)
		{
			swap(cities[i],cities[lesser]);
			lesser++;
		}
	}
	sortCities(lower,lesser-1);
	sortCities(lesser, upper);
	return;
}

void Fun()
{
	sortCities(0, N-1);
	for(auto a:cities)
	{
		DE(a.mus);
	}
}

int main()
{
	freopen("C:/SSDFiles/GitStuff/misc/input.txt", "r", stdin);				//text input
	int i, u, v;
	City c;

	cin>>N>>M>>K;
	for (int i=0; i<N; ++i)
	{
		cities.push_back(c);
	}
	for(i=0; i<M; i++)
	{
		cin>>u>>v;
		cout<<u<<v<<endl;
		cities[u].adj.push_back(v);
		cities[v].adj.push_back(u);
	}
	for(i=0; i<N; i++)
	{
		cin>>u;
		cities[i].mus=u;
	}

	Fun();

	return 0;
}