// import { useEffect } from "react";
import React, { useEffect, useState } from "react";

export default function Register() {
  //props are unchagable while state are changeble
  //useState is hook which help when data is changable
  var [count, setcount] = useState(100);
  var [name, setname] = useState("Pushpa");
  //when you visited the component useEffect is get called
  // useEffect(() => {
  //   console.log("useEffect called",count,name);

  // })

  //when you change inside the page use effect get called  in only once

  // useEffect(() => {
  //   console.log("useEffect called", count, name);
  // }, []);

  // useEffect(() => {
  //   console.log("useEffect called", count, name);
  // }, [name]);

  useEffect(() => {
    console.log("useEffect called", count, name)
    return () => {
      console.log("Im leaving!")
    }
  }, []);

  function f1() {
    //alert("hi!")

    setcount(count + 100);
  }

  function f2() {
    setname("Komal");
  }
  return (
    <div className="container">
      <h1>State Variable</h1>
      <p>{count}</p>
      <button onClick={f1}>Submit</button>
      <p>{name}</p>
      <button onClick={f2}>Change</button>
    </div>
  );
}
