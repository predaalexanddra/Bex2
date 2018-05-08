import React, { Component } from 'react';
import Book from './Book';

class Booklist extends Component{


        render() {
            // const books = this.props.title.map(book => <Book title={book.title} id={book.id} rating={book.rating} avalability={book.noAvailableCopies}/>);
            return (
                <div className="popularBooks__section" id="content">
                    <Book/><Book/><Book/>
                </div>
            );
        }
}

export default Booklist;