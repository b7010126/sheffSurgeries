package com.gbuckland

class BootStrap {

    def init = { servletContext ->
    
 def sarah =new Doctors( 

fullName: 'Dr Sarah Macdonald',
qualification: 'MBChB',
position: 'GP',
doctorEmail: 's.macdonald@myemail.com',
password: 'secret222',
doctorOffice: 'D-9888',
doctorPhone: '01111777',
bio: 'use placeholder text'
).save()

def tom =new Doctors (

fullName: 'Tom Handley',
qualification: 'PHD',
position: 'GP',
doctorEmail: 't.handley@hotmail.com',
password: 'yeet',
doctorOffice: '9142',
doctorPhone: '01111777564',
bio: 'yeet'
).save()

def Appointment =new Appointment (

appDate: new Date( '03/03/2019'),
appTime: '2:30pm',
appDuration: '30',
roomNumber: '9151'
).save()

def Appointment2 =new Appointment (

appDate: new Date( '11/04/2019'),
appTime: '3:00pm',
appDuration: '30',
roomNumber: 'A-1111'
).save()

def Surgery =new Surgery (

name: 'City Health Centre',
address: '21 Marble Street, Sheffield',
postcode: 'S115TY',
telephone: '0114555555',
numberOfPatients: '50',
description: 'use placeholder text',
openingTime: '9'
).save()

def Surgery2 =new Surgery (

name: 'Queens Hospital',
address: '101 Nottingham Road, Nottingham',
postcode: 'NG243TH',
telephone: '0114444543',
numberOfPatients: '50',
description: 'Health Problems',
openingTime: '9'
).save()

def Patient =new Patient (

patientName: 'Tom Rivers',
patientAddress: '2 One Way Street, Eckington',
patientResidence: 'Sheffield, Barnsley, Doncaster',
patientDob: new Date ('20/09/1998'),
patientID: 'E25555',
dateRegistered: new Date ('26/02/2018'),
patientPhone: '01142224444'
).save()

def Patient2 =new Patient (

patientName: 'Leah Hale',
patientAddress: '9 Bingley Crescent, Mansfield',
patientResidence: 'Nottingham',
patientDob: new Date ('21/09/1997'),
patientID: 'A32222',
dateRegistered: new Date ('30/01/2017'),
patientPhone: '07399544312'
).save()

def Receptionist =new Receptionist (

recepName: 'Rob Kingston',
recepEmail: 'r.kingston@email.com',
recepUsername: 'rking',
recepPassword: 'secret2019',
recepPhone: '01142224445'
).save()

def Receptionist2 =new Receptionist (

recepName: 'Ben Kata',
recepEmail: 'b.kata@email.com',
recepUsername: 'bkata',
recepPassword: 'secret2018',
recepPhone: '011143332221'
).save()

def Prescription =new Prescription (

pharmacyName: 'City Centre Pharmacy',
prescriptionNumber: '56788',
medicine: 'Paracetomol',
totalCost: '£5.90',
dateIssued: new Date ('25/05/2019'),
patientPaying: 'yes'
).save()

def Prescription2 =new Prescription (

pharmacyName: 'Queens Hospital',
prescriptionNumber: '56588',
medicine: 'Paracetomol',
totalCost: '£5.90',
dateIssued: new Date ('25/06/2019'),
patientPaying: 'no'
).save()

def Nurse =new Nurse (

nurseName: 'Susan Peter',
qualifications: 'Registered General Nurse',
nurseEmail: 's.peters@myemail.com',
nurseOffice: 'B-455',
nursePhone: '01142224433'
).save()

def Nurse2 =new Nurse (

nurseName: 'Alana Curry',
qualifications: 'Registered General Nurse',
nurseEmail: 'a.curry@hotmail.com',
nurseOffice: 'B-555',
nursePhone: '01143338899'
).save()




    }
}
