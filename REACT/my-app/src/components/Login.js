import React, { useRef } from 'react'

export default function Login() {
  //similar to get element by id

  let x1 = useRef();
  let x2 = useRef();
   let x3 = useRef();
  function f1() {
    //alert("hi!")
    console.log(x1, x2,x3);
    console.log(x1.current.value);
    console.log(x2.current.value);
     console.log(x3.current.value);
    var data = {
      name: x1.current.value,
      age:x2.current.value,
      place:x3.current.value
    };
    //console.log(data);
    data = JSON.stringify(data);
    //console.log(data);
    fetch("http://localhost:9000/users", {
      method: "post",
      body: data,
      headers: {
        "content-type": "application/json"
      }
    })
      .then(function (result) {
        console.log(result);
      })
      .catch(function (err) {
        console.log(err);
      });


  }
  return (
    <div className="container">
      <h1>Login form</h1>
      <input type="text" ref={x1} />
      <br />
      <input type="text" ref={x2} />
      <br />
      <input type="text" ref={x3} />
      <br />
      <button onClick={f1}>login</button>
      <p></p>
      <p></p>
    </div>
  );
}
