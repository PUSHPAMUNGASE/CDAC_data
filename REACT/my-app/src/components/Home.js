import React, { useState, useEffect } from "react";

export default function Home() {
  var [data, setdata] = useState([]);
  useEffect(() => {
    fetch("http://localhost:9000/users")
      .then((res) => res.json())
      .then((value) => {
        console.log(value);
        setdata(value);
      });
  }, []);
  return (
    <div className="container">
      <h1>Show Users</h1>
      <table class="table">
        <thead>
          <tr>
            <th scope="col">Name</th>
            <th scope="col">Age</th>
            <th scope="col">Place</th>
          </tr>
        </thead>
        
        <tbody>
          {data &&
            data.length > 0 &&
            data.map((record) => (
              <tr>
                <td>{record.name}</td>
                <td>{record.age}</td>
                <td>{record.place}</td>
              </tr>
            ))}
        </tbody>
      </table>
    </div>
  );
}
