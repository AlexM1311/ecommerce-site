//JavaScript //
var myObject = { //creare obiect
    property1: "Alert",
	property2: "Popup",
    method: function() {  // creare metoda
       return myObject.property1 + " "+ myObject.property2+ " ";  //returnare proprietati de pe obiect
    }
};

document.getElementById("click").innerHTML=myObject.method(); 

alert (myObject.property1);
alert(myObject.property2);
