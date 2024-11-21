import React from 'react';
class Class1 extends React.Component {
  constructor() {
    super();
    console.log(this);
    }
    
    f1() {
        this.props.age = 24;
    }
  render() {
      return (
        <div className="container">
          <h1>Props Example</h1>
          <p>Name:{this.props.name}</p>
              <p>Name:{this.props.age}</p>
              <button onClick={() => {
                  this.f1();
              }}>Submit</button>
        </div>
      );
  }
}

export default Class1;