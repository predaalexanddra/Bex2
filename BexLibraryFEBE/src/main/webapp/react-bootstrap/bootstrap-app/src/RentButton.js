import React, { Component } from 'react';
import { Modal, Button, Tooltip, Popover } from 'react-bootstrap';
import SelectField from 'material-ui/SelectField';
import MenuItem from 'material-ui/MenuItem';

class RentButton extends React.Component {
    constructor(props, context) {
        super(props, context);

        this.handleShow = this.handleShow.bind(this);
        this.handleClose = this.handleClose.bind(this);

        this.state = {
            show: false,
            value: 1
        };
    }

    handleChange = (event, index, value) => this.setState({value});

    handleClose() {
        this.setState({ show: false });
    }

    handleShow() {
        this.setState({ show: true });
    }

    render() {
        const popover = (
            <Popover id="modal-popover" title="popover">
                very popover. such engagement
        </Popover>
        );
        const tooltip = <Tooltip id="modal-tooltip">wow.</Tooltip>;

        return (
            <div >
                {/* <p>Click to get the full Modal experience!</p> */}

                <Button bsStyle="success" bsSize="large" onClick={this.handleShow}>
                    Rent Book
          </Button>

                <Modal className="modal" show={this.state.show} onHide={this.handleClose}>
                    <Modal.Header closeButton>
                        <Modal.Title>Rent <span className="book__titleModal">{this.props.title}</span></Modal.Title>
                    </Modal.Header>
                    <Modal.Body>
                        <SelectField
                            floatingLabelText="Choose period to rent"
                            value={this.state.value}
                            onChange={this.handleChange}
                        >
                            <MenuItem value={1} primaryText="1 week" />
                            <MenuItem value={2} primaryText="2 weeks" />
                            <MenuItem value={3} primaryText="3 weeks" />
                        </SelectField>


                    </Modal.Body>
                    <Modal.Footer>
                        <Button bsStyle="danger" bsSize="small" onClick={this.handleClose}>Submit</Button>
                        <Button bsStyle="primary" bsSize="small" onClick={this.handleClose}>Close</Button>
                    </Modal.Footer>
                </Modal>
            </div>
        );
    }
}



export default RentButton;