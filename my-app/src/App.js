import logo from './logo.svg';
import './App.css';
import React from 'react';

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = { name: '' };
  }

  handleChange = (event) => {
    this.setState({[event.target.name]: event.target.value});
  }

  handleCreate = (event) => {
    //alert('A form was submitted: ' + this.state.name);
    fetch('https://127.0.0.1/api/Create', {
        method: 'POST',
        body: JSON.stringify(this.state.name)
      }).then(function(response) {
        console.log(response)
        return response.json();
      });

    event.preventDefault();
}

handleEdit = (event) => {
    //alert('A form was submitted: ' + this.state.name);

    fetch('https://127.0.0.1/api/Edit', {
        method: 'PUT',
        body: JSON.stringify(this.state.name)
      }).then(function(response) {
        console.log(response)
        return response.json();
      });

    event.preventDefault();
}

handleDelete = (event) => {
    //alert('Bucket Name: ' + this.state.name);

    fetch('https://127.0.0.1/api/Delete', {
        method: 'Delete',
        body: JSON.stringify(this.state)
      }).then(function(response) {
        console.log(response)
        return response.json();
      });

    event.preventDefault();
}
  render() {
    return (
      <form>
        <br />
        <label>
          Bucket Name:
          <input type="text" value={this.state.value} name="name" onChange={this.handleChange} />
        </label>
        <br />
        <button onClick={this.handleCreate}>Create</button>
        <button onClick={this.handleEdit}>Edit</button>
        <button onClick={this.handleDelete}>Delete</button>
      </form>
    );
  }
}

export default App;
