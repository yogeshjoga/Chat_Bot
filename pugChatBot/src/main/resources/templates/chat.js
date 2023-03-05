const socket = new WebSocket('ws://localhost:8080/chat');

socket.onopen = () => {
  console.log('WebSocket connected.');
};

socket.onmessage = (event) => {
  const message = JSON.parse(event.data);
  const messages = document.getElementById('messages');
  const li = document.createElement('li');
  li.innerHTML = `${message.author}: ${message.content}`;
  messages.appendChild(li);
};

document.getElementById('chat-form').addEventListener('submit', (event) => {
  event.preventDefault();
  const input = document.getElementById('message-input');
  const message = input.value;
  input.value = '';
  const author = 'User';
  const chatMessage = { author, content: message };
  socket.send(JSON.stringify(chatMessage));
});
