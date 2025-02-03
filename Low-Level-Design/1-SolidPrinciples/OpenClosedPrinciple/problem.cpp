// Open for Extension but Closed for Modification
// Problem: The already written class which is already live and working well, should not be modified
// see line 56
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
};

class InvoicePrinter
{
private:
    Invoice invoice;

public:
    InvoicePrinter(Invoice invoice) : invoice(invoice) {}
    void printInvoice()
    {
        // prints Invoice
    }
};

class InvoiceSaver
{
private:
    Invoice invoice;

public:
    InvoiceSaver(Invoice invoice) : invoice(invoice) {}
    void saveToDB()
    {
        // Saves data to DB
    }
    //Modification
    void saveToFile(string filename)
    {
        // Saves invoice to the file given
    }
};

int main(int argc, char const *argv[])
{

    return 0;
}
