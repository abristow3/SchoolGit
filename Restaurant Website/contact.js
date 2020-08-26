function validation(){

var name = document.getElementById('name');
var email = document.getElementById('email');
var phone = document.getElementById('phone');
var checkedYes = document.getElementById('choice1');
var checkedNo = document.getElementById('choice2');
var monday = document.getElementById('monday');
var tuesday = document.getElementById('tuesday');
var wednesday = document.getElementById('wednesday');
var thursday = document.getElementById('thursday');
var friday = document.getElementById('friday');

    if (name.value == '' || name.value == null){
        alert('enter your name');
    }
    if (email.value == '' || email.value == null){
        alert('enter your email');
    }
    if (phone.value == '' || phone.value == null ){
        alert('enter your phone number');
    }
    if (checkedYes.checked == false && checkedNo.checked == false){
        alert('check yes or no')
    }  
    if (monday.checked == false && tuesday.checked == false && wednesday.checked == false
        && thursday.checked == false && friday.checked == false){
        alert('check a day of the week')
    }
     else { 
        alert ('data is valid')
    }
}
