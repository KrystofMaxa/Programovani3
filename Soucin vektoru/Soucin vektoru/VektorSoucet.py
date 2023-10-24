class Vektor:
    def __init__(self):
        self.arr = []
    
print("kolik dajmenzi")
dajmenze = int(input())

u = Vektor()
v = Vektor()

print("postupne napis souradnici pro prvni vektor")
for i in range(dajmenze):
    print(f"{i+1}. souradnici")
    x = int(input())
    v.arr.append(x)

print("postupne napis souradnici pro druhy vektor")
for i in range(dajmenze):
    print(f"{i+1}. souradnici")
    x = int(input())
    u.arr.append(x)


vysledekA = sum(u_i * v_i for v_i, u_i in zip(v.arr, u.arr))
print(f"Vysledna velikost pro u*v je: {vysledekA}")

vysledekB = sum(v_i*u_i for v_i, u_i in zip(v.arr, u.arr))
print(f"Vysledna velikost pro u*v je: {vysledekB}")

if vysledekA == vysledekB:
    print("Je komutativni")
