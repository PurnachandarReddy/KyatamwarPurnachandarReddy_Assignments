import React, { Component } from 'react'
import { Navbar, NavDropdown, Form, FormControl, Button, Nav } from 'react-bootstrap'
import {
    BrowserRouter as Router,
    Switch,
    Route,
    Link
} from "react-router-dom";

import Home from './Home';
import Contact from './Contact';
import About from './About';
import Services from './Services';


export default class NavbarComp extends Component {
    render() {
        return (
            <Router>
                <div>

                    <Navbar bg="gray" variant={"gray"} expand="lg">
                        <Navbar.Toggle aria-controls="navbarScroll" />                       
                            <Nav>
                                
                                <Nav.Link as={Link} to="/home">Home</Nav.Link>
                                <Nav.Link as={Link} to="/projects">Projects</Nav.Link>
                                <Nav.Link as={Link} to="/contact">Contact</Nav.Link>
                                <Nav.Link as={Link} to="/services">Services</Nav.Link>
                            </Nav>
                    </Navbar>
                </div>
                <div>
                    <Switch>
                        <Route path="/projects">
                            <About />
                        </Route>
                        <Route path="/contact">
                            <Contact />
                        </Route>
                        <Route path="/home">
                            <Home />
                        </Route>
                        <Route path="/services">
                            <Services />
                        </Route>
                    </Switch>
                </div>
            </Router>
        )
    }
}