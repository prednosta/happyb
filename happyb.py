class HappyB(object):
    vseNej = "Všechno nejlepší!\n"

    def __init__(self, jmeno):
        self.jmeno = jmeno

    def rekni(self, hlaska):
        stopka = 0
        while (True):
            print("{jmeno}: {hlaska}".format(jmeno=self.jmeno, hlaska=hlaska))
            stopka = stopka + 1
            if stopka == 30:
                break
        return HappyB.za_rok()

    def za_rok():
        return "Tak zase za rok!"

k = HappyB("Sestřičko")

print(k.rekni(HappyB.vseNej))
