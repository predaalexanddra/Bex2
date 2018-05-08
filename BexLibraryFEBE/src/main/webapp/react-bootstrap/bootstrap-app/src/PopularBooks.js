import React, { Component } from 'react';
import {Carousel, CarouselItem} from 'react-bootstrap';
import IconButton from 'material-ui/IconButton';
import Subheader from 'material-ui/Subheader';
import StarBorder from 'material-ui/svg-icons/toggle/star-border';
import Book from './Book';

const styles = {
    root: {
        display: 'flex',
        flexWrap: 'wrap',
        justifyContent: 'space-around',
    },
    gridList: {
        width: 500,
        height: 450,
        overflowY: 'auto',
    },
};



/**
 * A simple example of a scrollable `GridList` containing a [Subheader](/#/components/subheader).
 */
class PopularBooks extends Component {


    render() {
        console.log( this.props.booklist);
        const booksections = this.props.booklist.map(post => <Carousel.Item> <Book title={post.title} id={post.id} rating={post.rating}/> </Carousel.Item>);
        return (
            <div style={styles.root}>
               <Carousel className="carousel__pupularBooks">
                    {booksections}
                </Carousel>
            </div>
        );
    }
}
export default PopularBooks;