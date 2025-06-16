INSERT INTO products (id, name, price, image_url, rating, review_count, featured)
VALUES
(1, 'Dragon Plush', 19.99, 'https://example.com/img/dragon.png', 4.5, 3, true),
(2, 'Vampire Cloak', 49.95, 'https://example.com/img/cloak.png', 4.8, 5, false),
(3, 'Zombie Mug', 9.99, 'https://example.com/img/mug.png', 4.2, 2, false),
(4, 'Monster T-Shirt', 25.00, 'https://example.com/img/tshirt.png', 3.9, 4, true),
(5, 'Haunted Lamp', 34.99, 'https://example.com/img/lamp.png', 5.0, 7, true);

INSERT INTO reviews (id, username, rating, body, product_id)
VALUES
(1, 'alice', 5.0, 'Super soft and cute!', 1),
(2, 'bob', 4.0, 'Great quality but a bit small.', 1),
(3, 'charlie', 4.5, 'My kids love it!', 1),

(4, 'dan', 5.0, 'Feels magical, love it!', 2),
(5, 'eve', 4.5, 'Looks amazing at Halloween.', 2),

(6, 'frank', 4.0, 'Nice for a spooky morning coffee.', 3),
(7, 'grace', 4.5, 'Funny design and decent quality.', 3),

(8, 'heidi', 3.5, 'Fabric could be better.', 4),
(9, 'ivan', 4.0, 'Cool print!', 4),

(10, 'judy', 5.0, 'Spooky and bright!', 5),
(11, 'mallory', 5.0, 'Perfect Halloween vibe.', 5);
