"use strict";
class auth {
  //constructor is a method
  constructor() {
    this.details = [
      {
        email: "sam@gmail.com",
        password: "45rS23@p",
      },
      {
        email: "john@gmail.com",
        password: "45rDS23@p",
      },
      {
        email: "pushpa@gmail.com",
        password: "45r$S23@p",
      },
      {
        email: "komal@gmail.com",
        password: "45r$S2u3@p",
      },
    ];
  }

  checkemail(emailID) {
    console.log(emailID);

    var exp =
      /^([a-zA-Z0-9]+)@([a-zA-Z0-9]+)\.([a-zA-Z]{2,})(\.[a-zA-Z]{2,})?$/; //1        //2   //3     //4     //5        //6  //7

    var result = exp.test(emailID);
    return result;
  }
    checkpass(pass) {
        console.log(pass);
        var exp = /^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#\$]).{4,12}$/;
         var result = exp.test(pass);
         return result;
        

  }

  checkemailandpass() {}
}

export default auth;
