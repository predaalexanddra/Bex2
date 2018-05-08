import React, { Component } from 'react';
import AppBar from 'material-ui/AppBar';
import {MenuItem} from 'react-bootstrap';
import IconMenu from 'material-ui/IconMenu';
import IconButton from 'material-ui/IconButton';
import MoreVertIcon from 'material-ui/svg-icons/navigation/more-vert';
import Divider from 'material-ui/Divider';
import ArrowDropRight from 'material-ui/svg-icons/navigation-arrow-drop-right';
import DrawMenu from './DrawMenu';

const customStyles={
    background:'rgba(0,0,0,0)',
    borderWidth:'0',
    borderColor: 'transparent'
}

class AppFloatingBar extends Component {
    render() {
        return (
            <AppBar className="app__bar"
                style= {customStyles}
                iconElementLeft={<DrawMenu/>}
                
            
            />
        );
    }

}
 
    
export default AppFloatingBar;