// Put only generic methods in parent class
#include<bits/stdc++.h>
using namespace std;

class Vehicle{
public:
    virtual int getNumberOfWheels()=0;
};

class EngineVehicle:public Vehicle{
public:
    virtual string getEngineType()=0;
};

class Bike: public EngineVehicle{
    int numberOfWheels;
    string engineType;
public:
    int getNumberOfWheels() override{
        // gets Number of Wheels
    }
    string getEngineType() override{
        // gets Engine type
    }
};

class Bicycle: public Vehicle{
    int numberOfWheels;
public:
    int getNumberOfWheels() override{
        // gets Number of Wheels
    }
};


int main(int argc, char const *argv[])
{
    vector<Vehicle*> v;
    v.push_back(new Bike());
    return 0;
}
