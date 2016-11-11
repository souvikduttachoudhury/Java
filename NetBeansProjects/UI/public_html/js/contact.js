/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function display_msg(id1,id2){
var elem=document.getElementById(id1).value;
if(elem===''){
    document.getElementById(id2).innerHTML="<br/>This field cannot be left empty";
    document.getElementById(id2).style.color="red";
    document.getElementById(id2).style.fontSize="12.5px";
}
};
function remove_msg(id){
    document.getElementById(id).innerHTML="";
}
function validate(){
    var val=document.getElementById("cnt_form_name").value;
    if(val.length===0){
        document.getElementById("cnt_form_name_msgblock").innerHTML="<br/>This field cannot be left empty";
        document.getElementById("cnt_form_name_msgblock").style.color="red";
        document.getElementById("cnt_form_name_msgblock").style.fontSize="12.5px";
        return false;
    }
    else{
        for(i=0;i<val.length;i++){
        if(!isNaN(val.charAt(i))){
        document.getElementById("cnt_form_name_msgblock").innerHTML="<br/>Please enter a valid name";
        document.getElementById("cnt_form_name_msgblock").style.color="red";
        document.getElementById("cnt_form_name_msgblock").style.fontSize="12.5px";
        return false;
        }
        }
    }
    val=document.getElementById("cnt_form_phone").value;
    if(val.length===0){
        document.getElementById("cnt_form_phone_msgblock").innerHTML="<br/>This field cannot be left empty";
        document.getElementById("cnt_form_phone_msgblock").style.color="red";
        document.getElementById("cnt_form_phone_msgblock").style.fontSize="12.5px";
        return false;
    }
    else if(val.length>15){
        document.getElementById("cnt_form_phone_msgblock").innerHTML="<br/>Phone number is too long";
        document.getElementById("cnt_form_phone_msgblock").style.color="red";
        document.getElementById("cnt_form_phone_msgblock").style.fontSize="12.5px";
        return false;
    }
    else{
        for(i=0;i<val.length;i++){
        if(isNaN(val.charAt(i))){
        document.getElementById("cnt_form_phone_msgblock").innerHTML="<br/>Please enter a valid Phone Number";
        document.getElementById("cnt_form_phone_msgblock").style.color="red";
        document.getElementById("cnt_form_phone_msgblock").style.fontSize="12.5px";
        return false;
        }
        }
    }
    val=document.getElementById("cnt_form_email").value;
    if(val.length===0){
        document.getElementById("cnt_form_email_msgblock").innerHTML="<br/>This field cannot be left empty";
        document.getElementById("cnt_form_email_msgblock").style.color="red";
        document.getElementById("cnt_form_email_msgblock").style.fontSize="12.5px";
        return false;
    }
    else{
        var s=[],s1=[],s2=[];
        s=val.split(" ");
        console.log(s.length);
        if(s.length===1){
        s1=s[0].split('@');
        console.log(s1.length);
        if(s1.length===2){
            s2=s1[1].split('.');
            console.log(s2.length);
            if(s2.length===2){
                return true;
            }
            else{
            document.getElementById("cnt_form_email_msgblock").innerHTML="<br/>Enter a valid email id";
            document.getElementById("cnt_form_email_msgblock").style.color="red";
            document.getElementById("cnt_form_email_msgblock").style.fontSize="12.5px";
            return false;
            }
          }
          else{
          document.getElementById("cnt_form_email_msgblock").innerHTML="<br/>Enter a valid email id";
          document.getElementById("cnt_form_email_msgblock").style.color="red";
          document.getElementById("cnt_form_email_msgblock").style.fontSize="12.5px";
          return false;
         }
        }
        else{
        document.getElementById("cnt_form_email_msgblock").innerHTML="<br/>Enter a valid email id";
        document.getElementById("cnt_form_email_msgblock").style.color="red";
        document.getElementById("cnt_form_email_msgblock").style.fontSize="12.5px";
        return false;
        }
    }
    return true;
}