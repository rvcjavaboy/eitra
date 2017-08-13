'''
Author:		Ranjit Chavan
Date  :		8 Aug 2017

'''


class Address:
    def __init__(self,name,street_name):
        self.name=name;
        self.street_name=street_name;
    def display(self):
        print("Name: ",self.name);
        print("Street Name: ",self.street_name);


a=Address('Ranjit','Sangli')
a.display();
