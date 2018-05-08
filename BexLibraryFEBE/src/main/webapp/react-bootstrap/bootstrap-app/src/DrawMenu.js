import React from 'react';
import Drawer from 'material-ui/Drawer';
import MenuItem from 'material-ui/MenuItem';
import RaisedButton from 'material-ui/RaisedButton';
import IconButton from 'material-ui/IconButton';
import MoreVertIcon from 'material-ui/svg-icons/navigation/more-vert';
import Divider from 'material-ui/Divider';
import Download from 'material-ui/svg-icons/file/file-download';
import ArrowDropRight from 'material-ui/svg-icons/navigation-arrow-drop-right';

export default class DrawMenu extends React.Component {

    constructor(props) {
        super(props);
        this.state = { open: false };
    }

    handleToggle = () => this.setState({ open: !this.state.open });

    handleClose = () => this.setState({ open: false });

    render() {
        return (
            <div>
                <RaisedButton
                    icon={<MoreVertIcon color="#fff" />}
                    onClick={this.handleToggle}
                />
                <Drawer
                    docked={false}
                    width={200}
                    open={this.state.open}
                    onRequestChange={(open) => this.setState({ open })}
                >
                    <MenuItem onClick={this.handleClose}>Menu Item</MenuItem>
                    <MenuItem
                        primaryText="Cathegories"
                        rightIcon={<ArrowDropRight />}
                        menuItems={[
                            <MenuItem primaryText="Cut" />,
                            <MenuItem primaryText="Copy" />,
                            <Divider />,
                            <MenuItem primaryText="Paste" />,
                        ]}
                    />
                </Drawer>
            </div>
        );
    }
}