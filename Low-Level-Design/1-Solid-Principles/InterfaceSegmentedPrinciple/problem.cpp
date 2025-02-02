// Interfaces should be such, that client should not implement unnecessary function they do not need
#include <bits/stdc++.h>
using namespace std;

class RestaurantEmployee
{
public:
    virtual void serveCustomer() = 0;
    virtual void cookFood() = 0;
};

class Waiter : public RestaurantEmployee
{
public:
    void serveCustomer() override
    {
        // serving
    }
    void cookFood() override
    {
        // not my job
    }
};

class Chef : public RestaurantEmployee
{
public:
    void serveCustomer() override
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