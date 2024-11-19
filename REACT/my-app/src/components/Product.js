import React from "react";

export default function Product(props) {
    console.log(props);
    function f1() {
        //alert("Clicked!");
        props.price = 2000;
    }
  return (
    <div>
      <h2>{props.price}</h2>
      <p>{props.name}</p>
      <button onClick={f1}>Add to cart</button>
    </div>
  );
}
