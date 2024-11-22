import React, { useEffect, useState } from "react";
import { useDispatch, useSelector } from "react-redux";
import { addInCart } from "../redux/slices/cartSlice";
export default function Right(props) {
  let ans = useSelector((state) => state.category.value);
  var [product, setproduct] = useState([]);
  useEffect(() => {
    fetch("https://fakestoreapi.com/products/category/" + ans)
      .then((res) => res.json())
      .then((json) => setproduct(json));
  }, [ans]);
  let dispatch = useDispatch();

  function addtocart(value) {
    console.log(value);
    dispatch(addInCart(value));
  }
  return (
    <div>
      Right{props.p2}
      <p>Data from redux:{ans}</p>
      <div className="row">
        {product &&
          product.length > 0 &&
          product.map((value) => (
            <div className="col-3">
              <img src={value.image} alt="" className="img-fluid" />
              <h2>{value.price}</h2>
              <p>{value.title}</p>
              <button
                onClick={() => {
                  addtocart(value);
                }}
              >
                Add to cart
              </button>
            </div>
          ))}
      </div>
    </div>
  );
}
