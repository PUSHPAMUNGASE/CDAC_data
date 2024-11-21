import React from "react";
class Class3 extends React.Component {
  constructor() {
    super();
    console.log(this);
    this.state = {
      name: "Pushpa",
      age: 23,
    };
  }

  f1() {
    this.setState({
      name: "Rutuja",
      
    });
  }

  f2() {
    this.setState({
      age: this.state.age + 5,  
    });
  }
//componentDidmount cycle it will be called only once  all cycles are imp
    componentDidMount() {
        console.log("did mount cycle called!",this.state.name,this.state.age)
    }

//will be called when change every time
    componentDidUpdate() {
        console.log("did update cycle called!", this.state.name, this.state.age);
    }
//kind of destructor
    componentWillUnmount() {
        console.log("leaving component!");
    }
  render() {
    return (
      <div className="container">
        <h1>Life Cycle Hook</h1>
        <p>{this.state.name}</p>
        <button
          onClick={() => {
            this.f1();
          }}
        >
          Change name
        </button>
        <p>{this.state.age}</p>
        <button
          onClick={() => {
            this.f2();
          }}
        >
          Change age
        </button>
      </div>
    );
  }
}

export default Class3;
