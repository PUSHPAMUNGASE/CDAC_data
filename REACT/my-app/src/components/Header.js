import React from "react";
import { useSelector } from "react-redux";
import { Link } from "react-router-dom";

function Header() {
   var ans = useSelector(state=>state.cart.value);
 
  return (
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
      <div class="container-fluid">
        {/* <a class="navbar-brand" >
          Navbar
        </a> */}
        <button
          class="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarNav"
          aria-controls="navbarNav"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav">
            <li class="nav-item">
              <Link class="nav-link active" aria-current="page" to="/">
                Home
              </Link>
            </li>

            <li class="nav-item">
              <Link class="nav-link" to="/loginpage">
                Login
              </Link>
            </li>

            <li class="nav-item">
              <Link class="nav-link" to="/registerpage">
                Register
              </Link>
            </li>

            <li class="nav-item">
              <Link class="nav-link" to="/contentpage">
                Content
              </Link>
            </li>

            <li class="nav-item">
              <Link class="nav-link" to="/productpage">
                Products
              </Link>
            </li>

            <li class="nav-item">
              <Link class="nav-link" to="/class1">
                Class1
              </Link>
            </li>

            <li class="nav-item">
              <Link class="nav-link" to="/class2">
                Class2
              </Link>
            </li>

            <li class="nav-item">
              <Link class="nav-link" to="/class3">
                Class3
              </Link>
            </li>

            <li class="nav-item">
              <Link class="nav-link" to="/class4">
                Class4
              </Link>
            </li>

            <li class="nav-item">
              <Link class="nav-link" to="/left">
                Left
              </Link>
            </li>
            <li class="nav-item">
              <Link class="nav-link" to="/right">
                Right
              </Link>
            </li>

            <li class="nav-item">
              <Link class="nav-link" to="/parent">
                Parent
              </Link>
            </li>

            <li class="nav-item">
              <Link class="nav-link" to="/propsdrilling">
                Propsdrilling and ContextAPI
              </Link>
            </li>

            <li class="nav-item">
              <Link class="nav-link" to="/parent2">
                Parent2
              </Link>
            </li>

            <li class="nav-item">
              <Link class="nav-link" to="/child2">
                Child2
              </Link>
            </li>

            <li class="nav-item">
              <Link class="nav-link" to="/cart">
                Cart({ans.length})
              </Link>
            </li>

            {/* 
              <li class="nav-item">
                <a
                  class="nav-link disabled"
                  aria-disabled="true"
                
                >
               
                </a>
              </li> */}
          </ul>
        </div>
      </div>
    </nav>
  );
}
export default Header;
