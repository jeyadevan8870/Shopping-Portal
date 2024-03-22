import axios from 'axios';
import React, { useState } from 'react'

function LogIn(){
  const [name , setName] = useState("");
  const [password , setPassword] = useState("");
  
  async function save(event){
    event.preventDefault();

    try{
      await axios.post("http://localhost:8080/api/logIn",
      {
      
        userName:name,
        password:password
      });
      alert("logIn successfully");
      setName("");
      setPassword("");
    }
    catch(err){
      alert("logIn Failed");
    }
  }
  return (
    <div>
      <form>
        <div className='col-d-12'>
   
     <div class="card card-container">
      
   
        <div class="form-group">
          <label for="username">UserName: </label>
          <input
            type="text"
            class="form-control"
            value={name}
            onChange={(event) =>
            {
              setName(event.target.value)
            }}
         
          />
          
        </div>
        <div class="form-group">
          <label for="password">Password: </label>
          <input
            type="password"
            class="form-control"
            value={password}
            onChange={(event) =>
            {
              setPassword(event.target.value)
            }}
          
          />
         
        </div>
        <div class="button--login">
          <button class="btn btn-primary btn-block" onClick={save}>
            Login
          </button>
        </div>
    </div>
    </div>
    </form>
    </div>
  
  )
}

export default LogIn;