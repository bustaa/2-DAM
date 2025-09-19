import { View, Pressable, Text, Image, StyleSheet } from 'react-native';
import { useState } from 'react';

export default function App() {
  const [color, setColor] = useState('green');
  const [text, setText] = useState('My Title');
  const [image, setImage] = useState(require('./assets/splash-icon.png'));

  function handleOnPress() {
    if (color == 'green') {
      setColor('yellow');
      setText('My New Title');
      setImage(require('./assets/image-2.jpg'))
    } else {
      setColor('green');
      setText('My Title');
      setImage(require('./assets/splash-icon.png'));
    }
  }

  return (
    <View style={[styles.container, {backgroundColor : color}]}>
      <Text style={styles.title}>{text}</Text>
      <Image style={styles.image} source={image} />
      <Pressable onPress={handleOnPress}>
        <Text style={styles.text}>Pulsame!</Text>
      </Pressable> 
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: 'yellow',
    alignItems: 'center',
    justifyContent:'center',
  },
  title: {
    fontSize: 25,
    fontWeight: 'bold',
    fontStyle: 'italic',
    textDecorationLine: 'underline',
  },
  image: {
    width: 200,
    height: 200,
  },
  text: {
    height: 40,
    width: 80,
    backgroundColor: 'blue',
    borderRadius: 8,
    padding: 6,
  },
});