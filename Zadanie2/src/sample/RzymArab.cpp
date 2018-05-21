#include <iostream>
#include <string>
#include "RzymArab.h"

std::string RzymArab::liczby[13] = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

int RzymArab::rzym2arab(std::string rzym) throw(RzymArabException)
{
    int suma = 0;
    int war[13] = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    const std::string wzor = rzym;
    unsigned int pos;

    for(int i = 11; i > 0; i -= 2)
    {
        pos = rzym.find(liczby[i]);
        if(pos != std::string::npos)
        {
            suma += war[i];
            rzym[pos] = rzym[pos+1] = '0';
        };
    };
    for(int i = 12; i >= 0; i -= 2)
    {
        for(int j = 0; j < rzym.length(); j++)
        {
            if(rzym[j] == liczby[i].at(0))
                suma += war[i];
        };
    };

    int sprawdzenie = suma;
    if(RzymArab::arab2rzym(sprawdzenie) != wzor)
    {
        RzymArabException ex = RzymArabException(std::string ("Niepoprawne dane"));
        throw ex;
    }
    else
    {
        return suma;
    };
    return 0;
}

std::string RzymArab::arab2rzym(int arab) throw(RzymArabException)
{
    std::string wynik = "";
    if(arab > 3999 || arab < 1)
    {
        RzymArabException ex = RzymArabException(std::string ("Liczba spoza zakresu!"));
        throw ex;
    };
    int war[13] = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    int i = 12;
    while(i >= 0 && arab > 0)
    {
        if(arab >= war[i])
        {
            arab -= war[i];
            wynik += liczby[i];
            if(arab < war[i])
                i--;
        }
        else
            i--;
    };
    return wynik;
}
