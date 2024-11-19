import React, { useEffect, useState } from "react";
import axios from "axios";

export default function Product1() {
  var [record, setrecord] = useState([]);
  useEffect(() => {
    var result = axios.get("https://fakestoreapi.com/products");
    console.log(result);
    result.then(function (value) {
      console.log(value.data);
      setrecord(value.data);
    });
  }, []);
  return (
    <div className="container">
      <div className="row">
        {record &&
          record.length > 0 &&
          record.map((val) => (
            <div className="col-3">
              <img src={val.image} alt="" className="img-fluid" />
              <h2>{val.price}</h2>
              <p>{val.title}</p>
            </div>
          ))}
      </div>
    </div>
  );
}
