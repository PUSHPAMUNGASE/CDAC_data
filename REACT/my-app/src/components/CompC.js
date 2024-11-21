import React, { useContext } from "react";
import contextAPI from "../contextAPI";

export default function CompC(props) {
  var record = useContext(contextAPI);
  return (<div>CompC,{props.p2}
    <p>data from contextAPI:{record}</p></div>

  )
}
