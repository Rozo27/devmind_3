import React from 'react';
import './App.css';
import MaterialBooksTable from "./MaterialBooksTable";

class App extends React.Component {
  render() {
    return (
        <div id="container">
          <MaterialBooksTable bookInfo={data}/>
          {/*<BooksTable bookInfo={data} />*/}
        </div>
    );
  }
}

const data = [
  {
    id: 1,
    title: "Mock Turtle.",
    author: "Ambrose Waters",
    genre: "Deleniti",
    description: "And how odd the directions will look! ALICE'S RIGHT FOOT, ESQ. HEARTHRUG, NEAR THE FENDER, (WITH ALICE'S LOVE). Oh dear, what nonsense I'm talking!' Just then her head was so much at this, she.",
    image: "http://placeimg.com/480/640/any"
  },
  {
    id: 2,
    title: "After these came.",
    author: "Furman Ruecker",
    genre: "Corporis",
    description: "Lobster; I heard him declare, \"You have baked me too brown, I must be really offended. 'We won't talk about cats or dogs either, if you don't know one,' said Alice, as the jury eagerly wrote down on.",
    image: "http://placeimg.com/480/640/any"
  },
  {
    id: 3,
    title: "Alice. 'Anything.",
    author: "Zoie Torp",
    genre: "Perferendis",
    description: "Alice did not get hold of it; and as it didn't sound at all anxious to have got into the air. This time there could be no use in talking to him,' the Mock Turtle, and said to Alice, they all looked.",
    image: "http://placeimg.com/480/640/any"
  },
  {
    id: 4,
    title: "I should like it.",
    author: "Zelma Mosciski",
    genre: "Nisi",
    description: "Caterpillar decidedly, and there was mouth enough for it was impossible to say \"HOW DOTH THE LITTLE BUSY BEE,\" but it was too much frightened that she hardly knew what she was playing against.",
    image: "http://placeimg.com/480/640/any"
  },
  {
    id: 5,
    title: "All on a crimson.",
    author: "Kieran Brekke",
    genre: "Vel",
    description: "I must sugar my hair.\" As a duck with its eyelids, so he did,' said the Hatter: 'but you could only hear whispers now and then all the same, the next witness!' said the Dodo. Then they all crowded.",
    image: "http://placeimg.com/480/640/any",
  },
  {
    id: 6,
    title: "Alice went timidly.",
    author: "Shawna Hettinger",
    genre: "Omnis",
    description: "Heads below!' (a loud crash)--'Now, who did that?--It was Bill, the Lizard) could not possibly reach it: she could guess, she was exactly one a-piece all round. 'But she must have imitated somebody.",
    image: "http://placeimg.com/480/640/any",
  },
  {
    id: 7,
    title: "Alice's shoulder.",
    author: "Sherwood Wunsch",
    genre: "Repudiandae",
    description: "March Hare. 'Yes, please do!' pleaded Alice. 'And where HAVE my shoulders got to? And oh, my poor hands, how is it twelve? I--' 'Oh, don't talk about cats or dogs either, if you please! \"William the.",
    image: "http://placeimg.com/480/640/any",
  },
  {
    id: 8,
    title: "March Hare. 'I.",
    author: "Kristopher Denesik",
    genre: "Expedita",
    description: "Last came a little pattering of footsteps in the common way. So she began: 'O Mouse, do you know why it's called a whiting?' 'I never said I could not make out that she still held the pieces of.",
    image: "http://placeimg.com/480/640/any"
  },
  {
    id: 9,
    title: "I shall only look.",
    author: "Damian Hane",
    genre: "Ut",
    description: "Alice to herself. 'I dare say there may be ONE.' 'One, indeed!' said the Caterpillar. 'Well, I should say \"With what porpoise?\"' 'Don't you mean by that?' said the Cat, 'or you wouldn't have come.",
    image: "http://placeimg.com/480/640/any"
  },
  {
    id: 10,
    title: "Alice, whose.",
    author: "Kolby Ruecker",
    genre: "Dolor",
    description: "Let me see: that would be four thousand miles down, I think--' (she was obliged to say but 'It belongs to the little door, had vanished completely. Very soon the Rabbit hastily interrupted. 'There's.",
    image: "http://placeimg.com/480/640/any",
  },
  {
    id: 11,
    title: "King, and the.",
    author: "Alden Hahn",
    genre: "Sit",
    description: "I've got to the jury, of course--\"I GAVE HER ONE, THEY GAVE HIM TWO--\" why, that must be Mabel after all, and I never heard it before,' said Alice,) and round goes the clock in a very poor speaker,'.",
    image: "http://placeimg.com/480/640/any",
  },
  {
    id: 12,
    title: "However, the.",
    author: "Magnus Heathcote",
    genre: "Recusandae",
    description: "Mock Turtle. 'Hold your tongue, Ma!' said the Caterpillar took the watch and looked at the Mouse's tail; 'but why do you mean that you had been looking at the end of the Lizard's slate-pencil, and.",
    image: "http://placeimg.com/480/640/any"
  },
  {
    id: 13,
    title: "Gryphon, and all.",
    author: "Madilyn Bailey",
    genre: "Et",
    description: "Duchess said in a hurry: a large cauldron which seemed to be a Caucus-race.' 'What IS the use of this ointment--one shilling the box-- Allow me to sell you a couple?' 'You are not attending!' said.",
    image: "http://placeimg.com/480/640/any"
  },
  {
    id: 14,
    title: "Duchess, 'and.",
    author: "Citlalli Gibson",
    genre: "Possimus",
    description: "There was a table, with a deep voice, 'are done with a sigh: 'it's always tea-time, and we've no time to see it again, but it was a dispute going on shrinking rapidly: she soon made out that part.'.",
    image: "http://placeimg.com/480/640/any"
  },
  {
    id: 15,
    title: "Fish-Footman was.",
    author: "Dixie Casper",
    genre: "Inventore",
    description: "King put on one knee. 'I'm a poor man, your Majesty,' he began, 'for bringing these in: but I THINK I can guess that,' she added in a low voice, 'Your Majesty must cross-examine the next moment she.",
    image: "https://th.bing.com/th/id/OIP.MDTQMFnhDW3FoLCXWwEs8AHaLH?pid=ImgDet&rs=1"
  }
];

export default App;
