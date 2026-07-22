import { books } from "./Data";

function Books() {
  return (
    <div>
      {books.map((book) => (
        <div key={book.id}>
          <p><b>ID:</b> {book.id}</p>
          <p><b>Book:</b> {book.bname}</p>
          <p><b>Price:</b> ₹{book.price}</p>
          <hr />
        </div>
      ))}
    </div>
  );
}

export default Books;