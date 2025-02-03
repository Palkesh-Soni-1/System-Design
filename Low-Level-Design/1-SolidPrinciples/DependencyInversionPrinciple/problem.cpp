// Class should depend on Interfaces rather than concrete classes
#include <bits/stdc++.h>
using namespace std;

// Interfaces
class Mouse
{
public:
    virtual void functions() = 0;
};
class Keyboard
{
public:
    virtual void functions() = 0;
};

// Concrete classes
class WiredKeyboard : public Keyboard
{
public:
    void functions() override
    {
        // functions
    }
};
class BluetoothKeyboard : public Keyboard
{
public:
    void functions() override
    {
        // functions
    }
};

class WiredMouse : public Mouse
{
public:
    void functions() override
    {
        // functions
    }
};
class BluetoothMouse : public Mouse
{
public:
    void functions() override
    {
        // functions
    }
};

// Computer using concreate classes for wired devices.
class Computer
{
private:
    const WiredKeyboard keyboard;
    const WiredMouse mouse;
};

int main(int argc, char const *argv[])
{

    return 0;
}