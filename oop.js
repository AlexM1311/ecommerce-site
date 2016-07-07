var user = { //creare obiect
document.getElementById("demo").innerHTML = person.askName();
    name: "Guest",
    askName: function() {  // creare metoda
       return this.name + " ";
    },
    sayHi: function() {
        alert('Hi, my name is '+this.name)
    }
}
