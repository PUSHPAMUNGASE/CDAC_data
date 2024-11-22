import React from "react";
import ReactDOM from "react-dom";
import "bootstrap/dist/css/bootstrap.min.css";
import App from "./components/App";
import "./css/style.css";
import projectrout from "./projectrout";
import { RouterProvider } from "react-router-dom";
import projectstore from "./redux/projectstore";
 import { Provider } from "react-redux";
//console.log(React);
//console.log(ReactDOM);
import { Outlet, Link } from "react-router-dom";

const result = ReactDOM.createRoot(document.getElementById("root"));
// result.render("Hello world!!");

// var username = "Pushpa";
// var age = 23;
// result.render(

//     // this is JSX
//     <ul>
//         <li>
//         {username}
//         </li>
//         <li>
//             {age}
//         </li>
//     </ul>
// )

result.render(<App />);

result.render(
  <Provider store={projectstore}>
    <RouterProvider router={projectrout} />
  </Provider>
);
