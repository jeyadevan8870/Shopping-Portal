import React from 'react';
import './App.css';
import { Routes,Route } from 'react-router-dom';
import LogIn from './components/LogIn';
import Registration from './components/Registration'
import NavBar from './components/Navbar';
import Home from './components/Home';
import Womens from './components/Womens';
import Mens from './components/Mens';
import Kids from './components/Kids';
import Cart from './components/Cart';



function App() {
  return (
    <div className="App">
        
        <NavBar/>
     
        <Routes>
        <Route path='/' element={<Home />}></Route>
      <Route path='/log' element={<LogIn />}></Route>
      <Route path='/page2' element={<Registration />}> </Route>
      <Route path='/p1/:id' element={<Cart />}> </Route>
      <Route path='/womens' element={<Womens />}> </Route>
      <Route path='/Mens' element={<Mens />}> </Route>
      <Route path='/Kids' element={<Kids />}> </Route>
     </Routes>
   
 
  
    </div>
  );
}

export default App;
