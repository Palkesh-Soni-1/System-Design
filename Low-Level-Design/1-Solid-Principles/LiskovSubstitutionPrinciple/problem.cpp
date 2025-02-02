// If class B is subtype of class A, then we should be able to replace object of A with B without breaking the behaviour of the program
// subclass should extend the capability of the parent class and not narrow it down
// matlab-> class A ke pass 3 feature hai to class B ke pass vo 3 ya teen se jyada hi hone chahiye usse kam nhi or class B ko class A se replace krne ke time koi if ya but nhi hona chahiye!
// see line 40
#include <bits/stdc++.h>
using namespace std;

class Bike
{
protected:
    virtual void turnOnEngine() = 0;
    virtual void accelerate() = 0;
};

class MotorCycle : public Bike
{
private:
    bool isEngineOn;
    int speed;

public:
    void turnOnEngine() override
    {
        // turns On Engine
        isEngineOn = true;
    }
    void accelerate() override
    {
        // increase speed
        speed += 10;
    }
};

class Bicycle : public Bike
{
private:
    int speed;

public:
    void turnOnEngine() override
    {
        assert("No engine detected!"); // Narrows down the engine property
    }
    void accelerate() override
    {
        // increase speed
        speed += 2;
    }
};

int main(int argc, char const *argv[])
{

    return 0;
}