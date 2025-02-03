// Class should depend on Interfaces rather than concrete classes
// Computer should use constructor injection rather than using concrete classes
#include <bits/stdc++.h>
using namespace std;

// Interfaces
class Mouse
{
public:
    virtual void functions() = 0;
    virtual ~Mouse() {} // Virtual destructor
};
class Keyboard
{
public:
    virtual void functions() = 0;
    virtual ~Keyboard() {} // Virtual destructor
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

class Computer
{
private:
    Keyboard* keyboard;
    Mouse* mouse;
public:
    Computer(Keyboard* keyboard,Mouse* mouse):keyboard(keyboard),mouse(mouse){}
    void usePeripherals()
    {
        keyboard->functions();
        mouse->functions();
    }
};

int main(int argc, char const *argv[])
{
    // Creating concrete objects
    WiredKeyboard wiredKeyboard;
    BluetoothMouse bluetoothMouse;

    // Injecting dependencies into Computer
    Computer myComputer(&wiredKeyboard, &bluetoothMouse);

    // Using peripherals
    myComputer.usePeripherals();
    return 0;
}