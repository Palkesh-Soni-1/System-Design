// A class should have only one reason to change
// Problem: Invoice class has more than one responsibility
#include <bits/stdc++.h>
using namespace std;
class Marker
{
private:
    string name;
    string color;
    int mfg;

public:
    int price;
    Marker(string name, string color, int mfg, int price) : name(name), color(color), mfg(mfg), price(price) {}
};

class Invoice
{
private:
    Marker marker; // Invoice has a marker
    int quantity;

public:
    Invoice(Marker marker, int quantity) : marker(marker), quantity(quantity) {}
    int calculateInvoice()
    {
        int price = ((marker.price) * this->quantity);
    }
    void printInvoice()
    {
        // prints Invoice
    }
    void saveToDB()
    {
        // Saves data to DB
    }
};

int main(int argc, char const *argv[])
{

    return 0;
}
