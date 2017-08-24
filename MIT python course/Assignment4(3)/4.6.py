'''
make sub class of Address , CampusAddress
to display street_name,number and office number
'''


class Address:
    def __init__(self, street, num):
        self.street_name = street
        self.number = num

class CampusAddress(Address):
    def __init__(self,office_number):
        #__init__() of subclass is called
        Address.__init__(self,"'Massachusetts Ave'",'77')
        self.office_number="'"+office_number+"'"



Sarina_addr = CampusAddress("32-G904")
print Sarina_addr.office_number
print Sarina_addr.street_name
print Sarina_addr.number