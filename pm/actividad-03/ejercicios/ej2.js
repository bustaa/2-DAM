import { Text, Pressable, Image, View, StyleSheet } from 'react-native';
import { useState } from 'react';

export default function App() {
  const [image1, setImage1] = useState(require('./assets/icon.png'));
  const [image2, setImage2] = useState(require('./assets/favicon.png'));
  const [text1, setText1] = useState("Texto 1");
  const [text2, setText2] = useState("Texto 2");

  function imageOnPress(id) {
    if (id === 1) {
      if (image1 === (require('./assets/icon.png'))) {
        setImage1(require('./assets/favicon.png'));
        setText1("Texto cambiado");
      } else {
        setImage1(require('./assets/icon.png'))
        setText1("Texto 1");
      }
    }
    if (id === 2) {
      if (image2 === (require('./assets/favicon.png'))) {
        setImage2(require('./assets/icon.png'));
        setText2("Texto cambiado");
      } else {
        setImage2(require('./assets/favicon.png'));
        setText2("Texto 2");
      }
    }
  }

  return (
    <View style={styles.containerRow}>
      <Pressable onPress={() => imageOnPress(1)}>
        <Image style={styles.image} source={image1}/>
      </Pressable>
      <Text>{text1}</Text>
      <Pressable onPress={() => imageOnPress(2)}>
        <Image style={styles.image} source={image2}/>
      </Pressable>
      <Text>{text2}</Text>
    </View>
  )
}

const styles = StyleSheet.create({
  containerRow: {
    flex: 1,
    backgroundColor: 'white',
    alignItems: 'center',
    justifyContent: 'center',
    flexDirection: 'row',
  },
  image: {
    width: 100,
    height: 100
  }
})