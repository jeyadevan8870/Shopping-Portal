import React from "react";
import '../index.css';
import logo from '../image/logoecom.png'
import cart from '../image/add-cart.png'
import { Link } from "react-router-dom";
function NavBar() {
    return (
        <div>
            <header>
                <nav>
                    <img src={logo} width='100px' height='60px' />
                    <h3 className='logo--title'>Smart Shop</h3>
                    <div className="nav--input">
                        <input type="text" className="input--search" placeholder="Search for Products, Brands and More"></input>
                    </div>
                    <div>  <ul className="ul--nav">
                    <li >
                    <Link className="nav-button" to="/">Home</Link>
                </li>
                <li >
                    <Link className="nav-button" to="/log">LogIn</Link>
                </li>
                <li  >
                    <Link className="nav-button" to="/page2">SinUp</Link>
                </li >
            </ul></div>
                    <div class="dropdown">
                        <button class="dropbtn">Help</button>
                        <div class="dropdown-content">
                            <p>Account
                                
                            </p>
                            <p>Help</p>
                            <p>Support 24/7</p>

                        </div>
                    </div>
                    <img src={cart} width='100px' height='60px' />
                </nav>

            </header>
            
                   
        </div>
    )
}
export default NavBar