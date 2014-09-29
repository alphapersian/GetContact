GetContact
==========

returns a list&lt;hashmap&lt;name,number>> of phone contacts

HOW TO USE
============
//create a new from class

GetContacts contacts=new GetContacts(getApplicationContext());

private static final String TAG_NAME="name";
private static final String TAG_NUMBER="number";

list<hashmap<String ,String>> contacts=new arrayList<hashmap<String,String>>();


list = contacts.getContact();

