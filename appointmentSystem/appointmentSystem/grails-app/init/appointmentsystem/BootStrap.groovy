package com.gbuckland

class BootStrap {

    def init = { servletContext ->
    
 def doctor1 =new Doctors( 

fullName: 'Dr Sarah Macdonald',
qualification: 'MBChB',
position: 'GP',
doctorEmail: 's.macdonald@myemail.com',
password: 'secret222',
doctorOffice: 'D-9888',
doctorPhone: '01111777',
bio: 'use placeholder text'
).save()

def doctor2 =new Doctors (

fullName: 'Tom Handley',
qualification: 'PHD',
position: 'GP',
doctorEmail: 't.handley@hotmail.com',
password: 'yeet',
doctorOffice: '9142',
doctorPhone: '01111777564',
bio: 'yeet'
).save()



def surgery1 =new Surgery (

name: 'City Health Centre',
address: '21 Marble Street, Sheffield',
postcode: 'S115TY',
telephone: '0114555555',
numberOfPatients: '50',
description: 'use placeholder text',
openingTime: '9'
).save()

def surgery2 =new Surgery (

name: 'Queens Hospital',
address: '101 Nottingham Road, Nottingham',
postcode: 'NG243TH',
telephone: '0114444543',
numberOfPatients: '50',
description: 'Health Problems',
openingTime: '9'
).save()

def patient1 =new Patient (

patientName: 'Tom Rivers',
patientAddress: '2 One Way Street, Eckington',
patientResidence: 'Sheffield, Barnsley, Doncaster',
patientDob: new Date ('20/09/1998'),
patientID: 'E25555',
dateRegistered: new Date ('26/02/2018'),
patientPhone: '01142224444'
).save()

def patient2 =new Patient (

patientName: 'Leah Hale',
patientAddress: '9 Bingley Crescent, Mansfield',
patientResidence: 'Nottingham',
patientDob: new Date ('21/09/1997'),
patientID: 'A32222',
dateRegistered: new Date ('30/01/2017'),
patientPhone: '07399544312'
).save()

def appointment1 =new Appointment (

appDate: new Date( '03/03/2019'),
appTime: '2:30pm',
appDuration: 30,
roomNumber: '9151',
thepatient: patient1
).save()

def appointment2 =new Appointment (

appDate: new Date( '11/04/2019'),
appTime: '3:00pm',
appDuration: 30,
roomNumber: 'A-1111',
thepatient: patient2
).save()

def receptionist1 =new Receptionist (

recepName: 'Rob Kingston',
recepEmail: 'r.kingston@email.com',
recepUsername: 'rking',
recepPassword: 'secret2019',
recepPhone: '01142224445'
).save()

def receptionist2 =new Receptionist (

recepName: 'Ben Kata',
recepEmail: 'b.kata@email.com',
recepUsername: 'bkata',
recepPassword: 'secret2018',
recepPhone: '011143332221'
).save()

def prescription1 =new Prescription (

pharmacyName: 'City Centre Pharmacy',
prescriptionNumber: '56788',
medicine: 'Paracetomol',
totalCost: '£5.90',
dateIssued: new Date ('25/05/2019'),
patientPaying: 'yes',
thedoctors: doctor1
).save()

def prescription2 =new Prescription (

pharmacyName: 'Queens Hospital',
prescriptionNumber: '56588',
medicine: 'Paracetomol',
totalCost: '£5.90',
dateIssued: new Date ('25/06/2019'),
patientPaying: 'no',
thedoctors: doctor2
).save()

def nurse1 =new Nurse (

nurseName: 'Susan Peter',
qualifications: 'Registered General Nurse',
nurseEmail: 's.peters@myemail.com',
nurseOffice: 'B-455',
nursePhone: '01142224433'
).save()

def nurse2 =new Nurse (

nurseName: 'Alana Curry',
qualifications: 'Registered General Nurse',
nurseEmail: 'a.curry@hotmail.com',
nurseOffice: 'B-555',
nursePhone: '01143338899'
).save()

surgery1.addToReceptionists(receptionist1)
surgery2.addToReceptionists(receptionist2)
patient1.addToPrescriptions(prescription1)
patient2.addToPrescriptions(prescription2)
doctor1.addToPrescriptions(prescription1)
doctor2.addToPrescriptions(prescription2)
doctor1.addToAppointments(appointment1)
doctor2.addToAppointments(appointment2)
doctor1.addToPatients(patient1)
doctor2.addToPatients(patient2)
doctor1.addToNurses(nurse1)
doctor2.addToNurses(nurse2)
doctor1.addToSurgerys(surgery1)
doctor2.addToSurgerys(surgery2)
patient1.addToDoctors(doctor1)
patient2.addToDoctors(doctor2)
appointment1.addToSurgerys(surgery1)
appointment2.addToSurgerys(surgery2)
nurse1.addToSurgerys(surgery1)
nurse2.addToSurgerys(surgery2)
nurse1.addToDoctors(doctor1)
nurse2.addToDoctors(doctor2)





    }
}
