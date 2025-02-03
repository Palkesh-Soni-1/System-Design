// Interfaces should be such, that client should not implement unnecessary function they do not need
// so break the interface down!
#include <bits/stdc++.h>
using namespace std;

class WaiterInterface
{
public:
    virtual void serveCustomer() = 0;
    virtual void takeOrder() = 0;
};

class ChefInterface
{
public:
    virtual void cookFood() = 0;
    virtual void decideMenu() = 0;
};

class Waiter : public WaiterInterface
{
public:
    void serveCustomer() override
    {
        // serving
    }
    void takeOrder() override
    {
        // not my job
    }
};

class Chef : public ChefInterface
{
public:
    void decideMenu() override
    {
        // not my job
    }
    void cookFood() override
    {
        // cooking
    }
};

int main(int argc, char const *argv[])
{

    return 0;
}