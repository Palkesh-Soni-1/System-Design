// Open for Extension but Closed for Modification
// Problem: The already written class which is already live and working well, should not be modified
// so, we should make a interface(abstract class) and then implement it to whatever we want.
// see line 45
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

class InvoiceSaver{
public:
    virtual void save(Invoice invoice)=0;
};

class DatabaseInvoiceSaver:public InvoiceSaver
{
public:
    void save(Invoice invoice) override
    {
        // Saves data to DB
    }
};

class FileInvoiceSaver:public InvoiceSaver{
    string fileName;
public:
    FileInvoiceSaver(string fileName):fileName(fileName){}
    void save(Invoice invoice) override
    {
        // Saves data to file
    }
};

int main(int argc, char const *argv[])
{

    return 0;
}
